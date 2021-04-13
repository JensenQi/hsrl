package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpreadingPlague_42656 : Card() {
    override val id = 42656
    override val name = "传播瘟疫"
    override val description = "召唤一只1/5并具有<b>嘲讽</b>的甲虫。如果你的对手拥有的随从更多，则再次施放该法术。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Kotf
    override val background = "我一直以为瘟疫都是苍蝇老鼠在传播，可没想到你是这样的精灵。"
    override val artist = "Alex Alexandrov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a708e15e2a092386eb1067f81c64e659dd94a569d52201730c6cf8077acad2f3.png"
}
