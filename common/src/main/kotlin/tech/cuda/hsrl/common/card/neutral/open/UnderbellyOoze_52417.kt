package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnderbellyOoze_52417 : Card() {
    override val id = 52417
    override val name = "下水道软泥怪"
    override val description = "在该随从受到伤害并没有死亡后，召唤一个它的复制。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "不断吸收着那些失败的冒险者。"
    override val artist = "Danny Dai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1b657ed25e5fb6e25f1f9100648c33ed95340150d959891556bade3fee8ea55a.png"
}
