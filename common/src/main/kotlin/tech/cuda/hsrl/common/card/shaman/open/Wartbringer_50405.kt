package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wartbringer_50405 : Card() {
    override val id = 50405
    override val name = "疾疫使者"
    override val description = "<b>战吼：</b>如果你在本回合施放了两个法术，则造成2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“那么，她是怎么带来疾病的呢？用魔法？还是用什么载体装起来的？”"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3866627b6141502d060876cae0a9ed31df3faf18abab8d73fcd5c53b5c1a681c.png"
}
