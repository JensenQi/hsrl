package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ServantOfYoggSaron_38414 : Card() {
    override val id = 38414
    override val name = "尤格-萨隆的仆从"
    override val description = "<b>战吼：</b>随机施放一个法力值消耗小于或等于（5）点的法术<i>（目标随机而定）</i>。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Wotog
    override val background = "尤格-萨隆总是在抱怨自己的仆从太多，每天起床一想到还有那么多张嘴等着它喂就头疼。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3f42d598c442b8ad62809dc24c5d170bf8b5b4641566043fd433681b8c5c5a70.png"
}
