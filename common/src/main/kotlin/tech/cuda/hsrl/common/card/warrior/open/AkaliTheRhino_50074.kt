package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AkaliTheRhino_50074 : Card() {
    override val id = 50074
    override val name = "阿卡里，犀牛之神"
    override val description = "<b>突袭，超杀：</b>从你的牌库中抽一张具有<b>突袭</b>的随从牌，并使其获得+5/+5。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RastakhansRumble
    override val background = "巨魔战士冲锋时一般只喊“阿”，并没有喊出“卡里”的机会。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b86216d0f66cfb54693e9d9a1582452b5350bfe0ec411710a842c1bf03f76e10.png"
}
