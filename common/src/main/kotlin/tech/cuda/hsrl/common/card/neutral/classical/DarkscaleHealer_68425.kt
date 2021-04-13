package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkscaleHealer_68425 : Card() {
    override val id = 68425
    override val name = "暗鳞治愈者"
    override val description = "<b>战吼：</b>为所有友方角色恢复 2点生命值。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "她只是在闲暇时间做一些治疗工作。这其实只不过是一个业余爱好罢了。"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/592838a17a18e3708689233e0b8620d7264c6bc44ef0b0fc29d70acbbc79a181.png"
}
