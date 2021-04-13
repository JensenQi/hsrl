package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KiriChosenOfElune_61605 : Card() {
    override val id = 61605
    override val name = "基利，艾露恩之眷"
    override val description = "<b>战吼：</b> 将一张日蚀和一张月蚀置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "当太阳运行到月亮和艾泽拉斯之间时……发生的就是灾难现象了。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b81f3d82f88f0f3997710237fd58eacaa677eaca26761e6fd36b61fcfbff06b9.png"
}
