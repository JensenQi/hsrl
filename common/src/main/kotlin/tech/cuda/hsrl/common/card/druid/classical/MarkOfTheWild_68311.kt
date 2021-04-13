package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarkOfTheWild_68311 : Card() {
    override val id = 68311
    override val name = "野性印记"
    override val description = "使一个随从获得<b>嘲讽</b>和+2/+2。<i>（+2攻击力/+2生命值）</i>"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "这种爪子形状的印记如果纹在身上，人们一定知道你是德鲁伊玩家。"
    override val artist = "Brad Vancata"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a144bd99c38c7bec6308216ee5b578ac8f7e07c2ae04258678c61ac68f0bcabb.png"
}
