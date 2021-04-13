package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnlicensedApothecary_40598 : Card() {
    override val id = 40598
    override val name = "无证药剂师"
    override val description = "在你召唤一个随从后，对你的英雄造成5点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Msog
    override val background = "只不过配错了一瓶药水而已就被吊销执照，真是倒霉。"
    override val artist = "Jon Neimeister"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/470ba44cc5ac8844e1f5780d2dd0ce0418763dadda529e908a3580db92e7ec39.png"
}
