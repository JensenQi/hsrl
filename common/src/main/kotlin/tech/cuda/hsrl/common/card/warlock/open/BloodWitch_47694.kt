package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodWitch_47694 : Card() {
    override val id = 47694
    override val name = "鲜血女巫"
    override val description = "在你的回合开始时，对你的英雄造成 1点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.TheWitchwood
    override val background = "比这更可怕的是，咬一口发现半条虫子……"
    override val artist = "Qinghao Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f8aecc97e6abfbaf8a2a421f929686a63ce6d3c0b3ef19ddb705b0bc6f0a9e2a.png"
}
