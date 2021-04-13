package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JadeChieftain_40422 : Card() {
    override val id = 40422
    override val name = "青玉酋长"
    override val description = "<b>战吼：</b>召唤一个 的<b>青玉魔像</b>，使其获得<b>嘲讽</b>。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Msog
    override val background = "看着那些小家伙成长为身强体壮，仪表堂堂的青玉魔像时，他倍感骄傲。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/63ec950c61eebc8b61f6d8c01e841b75b4f79ee0961f8f0c41df332a0c6c7715.png"
}
