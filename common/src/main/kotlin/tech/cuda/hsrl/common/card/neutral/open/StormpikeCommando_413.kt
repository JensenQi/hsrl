package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StormpikeCommando_413 : Card() {
    override val id = 413
    override val name = "雷矛特种兵"
    override val description = "<b>战吼：</b>造成2点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "雷矛特种兵都是爆破专家。他们还会烘焙简易的蛋糕。"
    override val artist = "Kev Walker"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d10396bac0e8c1f627833be43993fb1b4da2982d4381cc78a4892ad4cd82424e.png"
}
