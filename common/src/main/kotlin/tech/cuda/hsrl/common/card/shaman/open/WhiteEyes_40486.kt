package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WhiteEyes_40486 : Card() {
    override val id = 40486
    override val name = "白眼大侠"
    override val description = "<b>嘲讽，亡语：</b> 将风暴守护者洗入你的牌库。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Msog
    override val background = "他的独门绝技就是朝你翻白眼。"
    override val artist = "Cole Eastburn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bbe5bdc005dc99c14ccca653c35ac127bd88ee34dd1b07b79e434624be8f4232.png"
}
