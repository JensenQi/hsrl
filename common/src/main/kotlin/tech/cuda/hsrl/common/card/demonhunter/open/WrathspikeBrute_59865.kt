package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WrathspikeBrute_59865 : Card() {
    override val id = 59865
    override val name = "怒刺蛮兵"
    override val description = "<b>嘲讽</b> 在该随从被攻击后，对所有敌人造成1点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "帮她抓背时会被她的背抓。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/41e352291d2bfceae3f619d29abafd8dd607aafab7a8e2072fb6ec6341adc6e7.png"
}
