package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NerubianUnraveler_42791 : Card() {
    override val id = 42791
    override val name = "蛛魔拆解者"
    override val description = "法术的法力值消耗增加（2）点。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "他就喜欢编织奇怪的故事。"
    override val artist = "Lars Grant-West"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/62cd531d3384d3553f8226dad1e2a0005347117a5ee0081f31417494a5e48bd9.png"
}
