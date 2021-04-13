package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WitchwoodApple_47553 : Card() {
    override val id = 47553
    override val name = "女巫森林苹果"
    override val description = "将三个2/2的树人置入你的 手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.TheWitchwood
    override val background = "一天一苹果，狼人远离我。"
    override val artist = "Vlad Botos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d35c887f432d3344c3725ab31fc25fe034cbc6c4fe2ce1c284bcbd1c4a9bd5c5.png"
}
