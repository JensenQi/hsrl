package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Voidwalker_48 : Card() {
    override val id = 48
    override val name = "虚空行者"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy1635
    override val background = "虽然他也拥有蓝色的，胖胖的身材，但他和某部动画片里的主角没关系。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/faf730b008473a643d603283c350baac98bb3c463fd7b77f6e7d4cdb5e7f402e.png"
}
