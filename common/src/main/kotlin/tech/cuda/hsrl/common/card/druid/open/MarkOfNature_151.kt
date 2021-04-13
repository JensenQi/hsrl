package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarkOfNature_151 : Card() {
    override val id = 151
    override val name = "自然印记"
    override val description = "<b>抉择：</b> 使一个随从获得+4攻击力；或者+4生命值和<b>嘲讽</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy3
    override val background = "只有德鲁伊们称之为“自然印记”。其他人都喜欢说“加个状态”。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3f6fc244ccf7b0b759af4337fb308efc06d9f870ceab254fa1a812143422ddfa.png"
}
