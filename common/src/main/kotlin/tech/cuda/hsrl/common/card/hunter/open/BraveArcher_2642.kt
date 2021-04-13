package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BraveArcher_2642 : Card() {
    override val id = 2642
    override val name = "神勇弓箭手"
    override val description = "<b>激励：</b>如果你没有其他手牌，则对敌方英雄造成2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Tgt
    override val background = "当她拈弓搭箭时，你的命运就已掌握在她的手中。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7b4786c7e640326132fe7146466254070ec2b771cd14c3e65edd0f184ad36d89.png"
}
