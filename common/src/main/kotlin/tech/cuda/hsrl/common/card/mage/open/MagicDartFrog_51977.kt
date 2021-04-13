package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MagicDartFrog_51977 : Card() {
    override val id = 51977
    override val name = "魔法蓝蛙"
    override val description = "在你施放一个法术后，随机对一个敌方随从造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RiseOfShadows
    override val background = "这只蛙的嗓门特别大。"
    override val artist = "Patrik Bjorkstrom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5899f4ae68cb67f44898e2017b51ce5cc2bfb193157c9b6f61462724e9554dfa.png"
}
