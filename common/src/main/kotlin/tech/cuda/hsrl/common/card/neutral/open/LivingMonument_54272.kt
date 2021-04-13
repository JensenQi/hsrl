package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LivingMonument_54272 : Card() {
    override val id = 54272
    override val name = "活化纪念碑"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 10
    override var health: Int? = 10
    override var attack: Int? = 10
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "它有狗头，所以是友军。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/764632c794940d7317705f7f6ca050156e5d00913e284874d7808a3f0ab0fcaf.png"
}
