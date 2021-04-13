package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RedManaWyrm_40281 : Card() {
    override val id = 40281
    override val name = "猩红法力浮龙"
    override val description = "每当你施放一个法术，便获得 +2攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "我为了这套猩红皮肤，额外花费了3个法力水晶。我现在看上去是不是棒极了！"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d7c2a373d0bba4a34ed005fe6b82bfd4316fbb568bb4010a9ef592ad1df7e118.png"
}
