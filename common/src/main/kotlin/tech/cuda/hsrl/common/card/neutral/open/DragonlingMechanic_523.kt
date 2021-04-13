package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonlingMechanic_523 : Card() {
    override val id = 523
    override val name = "机械幼龙技工"
    override val description = "<b>战吼：</b>召唤一个2/1的机械幼龙。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "她依然在想办法为咬咬先生装上火箭发射器。"
    override val artist = "Warren Mahy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fbdaa6a397e6688aebca4b55b531c33a8d7d5e034765b134c52b3671224aceee.png"
}
