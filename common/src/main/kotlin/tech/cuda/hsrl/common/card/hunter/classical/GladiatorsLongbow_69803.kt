package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GladiatorsLongbow_69803 : Card() {
    override val id = 69803
    override val name = "角斗士的长弓"
    override val description = "你的英雄在攻击时具有<b>免疫</b>。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "弓弦很长，这使得射手能够射得更远，对付那些难闻的目标尤其有效。"
    override val artist = "Peter C. Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3ed6b7d3607cb276a2162caf7a8968a763f01d3e86fda75e4f51fd5ae6c7f68e.png"
}
