package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnubarAmbusher_1810 : Card() {
    override val id = 1810
    override val name = "阿努巴尔伏击者"
    override val description = "<b>亡语：</b> 随机将一个友方随从移回你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Naxx
    override val background = "他原来的名字叫作“阿努巴尔弹回者”，因为他喜欢把队友弹回玩家手上。虽然他改掉了这个坏习惯并因此改了名，但他有时还是会情不自禁。"
    override val artist = "Nate Bowden"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5512400ff89d497792dd29cda00d178f8ec8170912fc29ae4da05d278be854a2.png"
}
