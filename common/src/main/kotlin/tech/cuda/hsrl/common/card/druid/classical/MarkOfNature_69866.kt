package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarkOfNature_69866 : Card() {
    override val id = 69866
    override val name = "自然印记"
    override val description = "<b>抉择：</b> 使一个随从获得+4攻击力；或者+4生命值和<b>嘲讽</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "只有德鲁伊们称之为“自然印记”。其他人都喜欢说“加个状态”。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8253f7d0b93b41d1a9d8948eb4b7d6e45adacc27ae5e40bf31286a492a75103d.png"
}
