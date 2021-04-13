package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Voidwalker_68347 : Card() {
    override val id = 68347
    override val name = "虚空行者"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "虽然他也拥有蓝色的，胖胖的身材，但他和某部动画片里的主角没关系。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4873be4fd9c58c8c11217e9a1953ade4f174b4b5fffdc35d2c111532ed059b66.png"
}
