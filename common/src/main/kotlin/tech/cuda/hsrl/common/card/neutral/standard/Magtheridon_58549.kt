package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Magtheridon_58549 : Card() {
    override val id = 58549
    override val name = "玛瑟里顿"
    override val description = "<b>休眠</b>。 <b>战吼：</b>为你的对手召唤三个1/3的典狱官。当她们死亡时，消灭所有随从并唤醒。"
    override var cost: Int? = 4
    override var health: Int? = 12
    override var attack: Int? = 12
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "外域的入侵者，自异世而来，企图征服世界……却被另一个外域的入侵者，自异世而来的精灵所征服。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e0018d743e7f824600182c3ce9dcabb629ded1cd0769e2560a51fa4ea23d6bc4.png"
}
