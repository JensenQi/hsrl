package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlinkFox_48199 : Card() {
    override val id = 48199
    override val name = "闪狐"
    override val description = "<b>战吼：</b>随机将一张<i>（你对手职业的）</i>卡牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.TheWitchwood
    override val background = "狐狸到底怎么叫？"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e75dd6b4b494920aca2a31c38390d2754e39edc345e48ca92f8200d5e6fee99c.png"
}
