package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GalakrondTheTempest_57427 : Card() {
    override val id = 57427
    override val name = "风暴巨龙迦拉克隆"
    override val description = "<b>战吼：</b>召唤两个2/2并具有<b>突袭</b>的风暴。<i>（ ）</i>"
    override var cost: Int? = 7
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.DescentOfDragons
    override val background = "哈加莎在风中呼喊：“诚然，您的威力可以与大漩涡相匹敌！”而风暴向她回答：“我就是大漩涡。”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b43d24ded8240c3c6c897393057a1a4a6fa04ea1ce43b34a1c9689ea116084dd.png"
}
