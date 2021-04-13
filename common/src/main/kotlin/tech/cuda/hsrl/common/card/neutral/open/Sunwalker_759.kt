package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sunwalker_759 : Card() {
    override val id = 759
    override val name = "烈日行者"
    override val description = "<b>嘲讽</b> <b>圣盾</b>"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "她不是真的能够在太阳上行走。这只是个名称，别担心！"
    override val artist = "Andrea Uderzo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b52ddf2a9ca9d5e3325e512d48ba9bc26616a62e4fb7f39d429f3511817b56c3.png"
}
