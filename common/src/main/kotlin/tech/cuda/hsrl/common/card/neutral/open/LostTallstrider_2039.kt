package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LostTallstrider_2039 : Card() {
    override val id = 2039
    override val name = "迷失的陆行鸟"
    override val description = ""
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "在它的屁股上印着这样一串文字：“如果你找到它，请将它归还至莫高雷。”"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1ff8e5353814319a1df8e0f81e95b6ab762fb4720194bdc451568a9f91ed8e73.png"
}
