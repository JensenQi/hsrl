package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonlingMechanic_68439 : Card() {
    override val id = 68439
    override val name = "机械幼龙技工"
    override val description = "<b>战吼：</b>召唤一个2/1的机械幼龙。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "她依然在想办法为咬咬先生装上火箭发射器。"
    override val artist = "Warren Mahy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/481eb5a8fc6e2c481a5958a4e89ae8697126328a618d1086ee26992e7adbb535.png"
}
