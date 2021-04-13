package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PotionOfPolymorph_40409 : Card() {
    override val id = 40409
    override val name = "变形药水"
    override val description = "<b>奥秘：</b>在你的对手使用一张随从牌后，将其变形成为1/1的绵羊。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Msog
    override val background = "现已推出新产品：香蕉牛奶风味。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7c861d01de95ba67e773ab87833c72413fc0bef3aef840f0a95ed74394827b39.png"
}
