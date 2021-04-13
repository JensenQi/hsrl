package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GladiatorsLongbow_311 : Card() {
    override val id = 311
    override val name = "角斗士的长弓"
    override val description = "你的英雄在攻击时具有<b>免疫</b>。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "弓弦很长，这使得射手能够射得更远，对付那些难闻的目标尤其有效。"
    override val artist = "Peter C. Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/acff2530b7d98d876f5839a454d7707f3f1257666055cfb0ac44658b652ea2a7.png"
}
