package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LabRecruiter_48480 : Card() {
    override val id = 48480
    override val name = "实验室招募员"
    override val description = "<b>战吼：</b>将一个友方随从的三张复制洗入你的牌库。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.BoomsdayProject
    override val background = "快加入实验室吧！我们有全套的保障方案。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7867a5a19304f8ecc2608bf5d606e6879b57f84dafdf13fbd8f919db7289f19d.png"
}
