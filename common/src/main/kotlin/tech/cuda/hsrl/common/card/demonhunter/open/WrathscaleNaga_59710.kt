package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WrathscaleNaga_59710 : Card() {
    override val id = 59710
    override val name = "怒鳞纳迦"
    override val description = "在一个友方随从死亡后，随机对一个敌人造成3点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "若你愿意投掷武器，召唤小弟置之死地。"
    override val artist = "Ware Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6fa0fa56444d202e406342a57e15a2d48d53028859c65ecac3062f2ac8b22a7d.png"
}
