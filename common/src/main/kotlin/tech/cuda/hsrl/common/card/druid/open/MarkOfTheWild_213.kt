package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarkOfTheWild_213 : Card() {
    override val id = 213
    override val name = "野性印记"
    override val description = "使一个随从获得<b>嘲讽</b>和+2/+3。<i>（+2攻击力/+3生命值）</i>"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy1635
    override val background = "这种爪子形状的印记如果纹在身上，人们一定知道你是德鲁伊玩家。"
    override val artist = "Brad Vancata"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5ab8c3d206a54d0c4cf2303c026f6c61150e160980de0ddf935bafc673e3dceb.png"
}
