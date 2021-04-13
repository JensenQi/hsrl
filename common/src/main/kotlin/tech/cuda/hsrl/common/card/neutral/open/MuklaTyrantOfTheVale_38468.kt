package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MuklaTyrantOfTheVale_38468 : Card() {
    override val id = 38468
    override val name = "山谷之王穆克拉"
    override val description = "<b>战吼：</b>将两根香蕉置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "其实除了香蕉之外，他还喜欢吃花生酱。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/82938539cb9e2f0a3252bad8474e16ef9f9db0d464961e48bd5457d4392c38a7.png"
}
