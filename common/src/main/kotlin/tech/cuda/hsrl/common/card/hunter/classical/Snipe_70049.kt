package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Snipe_70049 : Card() {
    override val id = 70049
    override val name = "狙击"
    override val description = "<b>奥秘：</b>在你的对手使用一张随从牌后，对该随从造成 4点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "伟大的狙击手总是能够正中目标。就像吃下一整块猪肋排。嗯，味道好极了。"
    override val artist = "Lorenzo Minaca"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e03e0eb7b71bc5bd8c605e4a59e854fa3a22132a04877a7800e85b2e3cac946f.png"
}
