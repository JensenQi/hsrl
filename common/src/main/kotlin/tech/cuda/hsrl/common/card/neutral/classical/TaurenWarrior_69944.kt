package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TaurenWarrior_69944 : Card() {
    override val id = 69944
    override val name = "牛头人战士"
    override val description = "<b>嘲讽</b>，<b>激怒：</b> +3攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "牛头人战士：莫高雷勇士，野猪人杀手，雷霆崖电梯发明者。"
    override val artist = "Paul Warzecha"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e5c9b5d8006d78cd9d30c6b7918a5b9e6cec5c7c17d36494d7d42aba9276154a.png"
}
