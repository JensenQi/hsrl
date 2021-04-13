package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sunwalker_69822 : Card() {
    override val id = 69822
    override val name = "烈日行者"
    override val description = "<b>嘲讽</b> <b>圣盾</b>"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "她不是真的能够在太阳上行走。这只是个名称，别担心！"
    override val artist = "Andrea Uderzo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/15b1f48b01f58860a7650c72312006b8a5c64747a40fe9c4b7dc2759d584a233.png"
}
