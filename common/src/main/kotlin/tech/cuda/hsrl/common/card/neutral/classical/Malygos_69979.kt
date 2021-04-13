package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Malygos_69979 : Card() {
    override val id = 69979
    override val name = "玛里苟斯"
    override val description = "<b>法术伤害+5</b>"
    override var cost: Int? = 9
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "玛里苟斯憎恨凡人使用魔法。那会让他气急败坏！"
    override val artist = "Michael Komarck"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c35327613ceb780d8f560a6b6ce82b751ad28b8665b891302c2d27489c99a3e1.png"
}
