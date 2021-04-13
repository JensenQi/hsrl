package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AbyssalEnforcer_40541 : Card() {
    override val id = 40541
    override val name = "渊狱惩击者"
    override val description = "<b>战吼：</b>对所有其他角色造成3点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Msog
    override val background = "渊狱惩击者不同于一般的地狱火，红水晶所蕴含的强大能量在卡扎库斯的调校下，发挥出惊人的威力！"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a3c38dda831d4b40174a316280e196ba5df7798e24c1ceb82bd03536c49d9b29.png"
}
