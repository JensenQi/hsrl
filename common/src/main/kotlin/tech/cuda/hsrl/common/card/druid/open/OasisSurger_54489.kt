package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OasisSurger_54489 : Card() {
    override val id = 54489
    override val name = "绿洲涌动者"
    override val description = "<b>突袭</b> <b>抉择：</b>获得+2/+2；或召唤一个该随从的 复制。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "浪起来，伙计！"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/df53b70638f2c1d6f5ca1f53e88adf40164460e6537114f6d7b6da3e36900b27.png"
}
