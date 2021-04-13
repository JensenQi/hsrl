package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArchbishopBenedictus_42633 : Card() {
    override val id = 42633
    override val name = "大主教本尼迪塔斯"
    override val description = "<b>战吼：</b>复制你对手的牌库，并洗入你的 牌库。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Kotf
    override val background = "他开设的宗教裁判所成为很多人的梦魇。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b491d9f23e88d572cf35890af9c9eb15ffcd9fd3cad9e268bf4a6bb108519f45.png"
}
