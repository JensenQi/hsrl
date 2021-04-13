package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StormpikeCommando_68392 : Card() {
    override val id = 68392
    override val name = "雷矛特种兵"
    override val description = "<b>战吼：</b>造成2点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "雷矛特种兵都是爆破专家。他们还会烘焙简易的蛋糕。"
    override val artist = "Kev Walker"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9019dc605a2a68040788f0748191eefd3fb74fc495ac7679d74e80a8122055b6.png"
}
