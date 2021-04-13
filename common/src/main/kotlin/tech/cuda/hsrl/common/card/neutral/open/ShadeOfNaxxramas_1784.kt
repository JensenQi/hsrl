package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadeOfNaxxramas_1784 : Card() {
    override val id = 1784
    override val name = "纳克萨玛斯之影"
    override val description = "<b>潜行。</b>在你的回合开始时，获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "纳克萨玛斯之影真的很讨厌活的东西。在他们看来，人类和兽人确实有所区别，就像蛆虫和老鼠的区别一样。"
    override val artist = "Ittoku"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6b77d53b0f57a1e47794fa1531ff240beae4cc816dd97d91d1186993d74960e5.png"
}
