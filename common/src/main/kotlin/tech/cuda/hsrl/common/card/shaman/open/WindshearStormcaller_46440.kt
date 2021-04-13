package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WindshearStormcaller_46440 : Card() {
    override val id = 46440
    override val name = "风剪唤风者"
    override val description = "<b>战吼：</b>如果你控制全部四种基础图腾，则召唤风领主奥拉基尔。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "不用怀疑，奥拉基尔最喜欢的就是基础图腾。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3786e88c834ddae8194726c17398f3d9c1072c8fb4c0051206788890e2b3f4fb.png"
}
