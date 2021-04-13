package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PhaseStalker_55291 : Card() {
    override val id = 55291
    override val name = "相位追猎者"
    override val description = "在你使用你的英雄技能后，从你的牌库中施放一个<b>奥秘</b>。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.DescentOfDragons
    override val background = "我又跳出来了！我又站回去了！"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4514a059ee68a5090391dec6603d4b62b9af039f17ecf195f575d25097153d00.png"
}
