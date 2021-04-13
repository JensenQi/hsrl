package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PoisonSeeds_1802 : Card() {
    override val id = 1802
    override val name = "剧毒之种"
    override val description = "消灭所有随从，并召唤等量的2/2树人代替他们。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Naxx
    override val background = "把植物种在地上是保护环境，种在敌人身体里就是另外一回事情了。"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b4b01709a8c0d8b788a56b93e34bb92bcfdfbbdda7fe83977476375dc567c557.png"
}
