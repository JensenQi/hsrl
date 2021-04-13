package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrozenCrusher_41253 : Card() {
    override val id = 41253
    override val name = "冰冻粉碎者"
    override val description = "在该随从攻击后，会自我<b>冻结</b>。"
    override var cost: Int? = 6
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "他讲过的很多笑话，自己都觉得冷。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a75d5c558c2d73646d7817e9eb0109dc0b20b9c956d883bd6e89a898de807efa.png"
}
