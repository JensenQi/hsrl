package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Brightwing_69672 : Card() {
    override val id = 69672
    override val name = "光明之翼"
    override val description = "<b>战吼：</b>随机将一张<b>传说</b>随从牌置入你的 手牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "小精灵龙一般是由糖、香料和无数个疯狂的副作用所组成的。"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9b9ae3b9c3cc813c262a2cccc010a6d669ea173067a1282205781fefa1e10c9f.png"
}
