package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShakuTheCollector_40905 : Card() {
    override val id = 40905
    override val name = "收集者沙库尔"
    override val description = "<b>潜行</b>。每当该随从攻击时，随机将一张<i>（你对手职业的）</i>卡牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Msog
    override val background = "艾雅曾调查过沙库尔，看看他有没有私藏什么好东西。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/219d24b3f319230a8f5f4a1cb1714f69006ffc2eab7fbb8ec1c3ae27ef6dafda.png"
}
