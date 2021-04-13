package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StreetTrickster_40213 : Card() {
    override val id = 40213
    override val name = "杂耍小鬼"
    override val description = "<b>法术伤害+1</b>"
    override var cost: Int? = 3
    override var health: Int? = 7
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "他最得意的戏法，就是让你的钱包消失不见！"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ceec18c239cd620985f8900d299d1b0dd010f2ed80bb4dde0240d036fa76a393.png"
}
